"""
2. Create a menu-driven program that allows users to interact with different functionalities related to classes
 and objects. 
The example should include a simple system to manage a library, where you can add books, view books, and search for 
books. 
Illustrate the use of classes, objects, and user-driven menus as shown below. 
Library Management System 
1. Add Book 
2. View All Books 
3. Search Book by Title 
4. Exit Enter your choice 
(1-4): Classes and Methods will be as follows:
Book Class: should Represents a book with title, author, and year attributes. The __str__ method
provides a string representation for easy printing.
Library Class: Manages a list of Book objects. It includes methods to add a book (add_book), view all
books (view_books), and search for a book by title (search_book).
Menu Functionality will be as follows:
print_menu Function: Prints the menu options for user interaction.
main Function: Runs the menu-driven program loop. It prompts the user to make a choice and performs
the corresponding action (add, view, search, or exit).
User Interaction will be as follows:
The program interacts with the user through the console. It handles book additions, views, and searches
based on user input
"""
class Book:
    def __init__(self, title, author, year):
        self.title = title  
        self.author = author  
        self.year = year  

    def __str__(self):
        return ("Title: ",self.title," Author: ",self.author," Year: ",self.year)


class Library:
    def __init__(self):
        self.books = []

    def add_book(self, title, author, year):
        new_book = Book(title, author, year)
        self.books.append(new_book)
        print(f"Book '{title}' by {author} added successfully.")

    def view_books(self):
        if not self.books:
            print("No books in the library.")
        else:
            print("Books in the library:")
            for book in self.books:
                print(book)

    def search_book(self, title):
        found_books = [book for book in self.books if title.lower() in book.title.lower()]
        if found_books:
            print("Search Results:")
            for book in found_books:
                print(book)
        else:
            print("No books found with that title.")


def print_menu():
    print("\nLibrary Management System")
    print("1. Add Book")
    print("2. View All Books")
    print("3. Search Book by Title")
    print("4. Exit")


def main():
    library = Library()

    while True:
        print_menu()  
        choice = int(input("Enter your choice (1-4): "))

        if choice == 1:
            title = input("Enter the book title: ")
            author = input("Enter the author's name: ")
            year = input("Enter the year of publication: ")
            library.add_book(title, author, year)

        elif choice == 2:
            library.view_books()

        elif choice == 3:
            title = input("Enter the book title to search: ")
            library.search_book(title)

        elif choice == 4:
            print("Exiting the program.")
            break

        else:
            print("Invalid choice. Please try again.")

if __name__ == "__main__":
    main()
