import pandas as pd 
import numpy as np 
import tensorflow as tf
from sklearn.preprocessing import StandardScaler , LabelEncoder , OneHotEncoder
import streamlit as st
import pickle
#load the train model 

model = tf.keras.models.load_model('model.h5')

with open('label_encoder.pkl' , "rb") as file:
    label_encoder_gender = pickle.load(file)


with open('geo_encoder.pkl' , "rb") as file:
    onehot_encoder_geo = pickle.load(file)


with open('scaler.pkl' , "rb") as file:
    scaler = pickle.load(file)

st.title("Customer Churn Prediction")

#User Input 

geography=st.selectbox('Geography',onehot_encoder_geo.categories_[0])
gender = st.selectbox("Gender" , label_encoder_gender.classes_)
age = st.number_input("Age",18,92)  #by default step size is 1 we can define any other step
balance = st.number_input("Balance") #similar to above wew can define range for this also 
CredtScore = st.number_input("CreditScore")
EstimatedSalary = st.number_input("EstimatedSalary")
Tenure = st.slider("Tenure",0,10)  #0-10 min max size
Products = st.slider("No. of Product",1,4)
CreditCard = st.selectbox("Has Credit Card" , [0,1])
isActiveMemberr = st.selectbox("Is Active Member" , [0,1])

if(st.button("Estimeate")):

        input_data=pd.DataFrame({
            'CreditScore':[CredtScore],	
            'Gender':label_encoder_gender.transform([gender])[0],
            'Age':[age],
            'Tenure':[Tenure],
            'Balance':[balance],
            'NumOfProducts':[Products],
            'HasCrCard':[CreditCard],
            'IsActiveMember':[isActiveMemberr],
            'EstimatedSalary':[EstimatedSalary]
        })
        ##one hot encode on geography
        geo_encoded=onehot_encoder_geo.transform([[geography]]).toarray()
        geo_encoded_df=pd.DataFrame(geo_encoded,columns=onehot_encoder_geo.get_feature_names_out(['Geography']))

        #combine one hot encoded columns with input data dataframe
        input_data=pd.concat([input_data,geo_encoded_df],axis=1)

        # Scale the input data
        input_data_scaled=scaler.transform(input_data)

        #Predict churn
        prediction=model.predict(input_data_scaled)
        predict_proba=prediction[0][0]

        st.write(f"Churn Probability: {predict_proba}")

        if predict_proba > 0.5:
            st.write("The customer is likely to churn")
        else:
            st.write("The customer is not likely to churn")
    
