"""Q8: Try to open and write to a file that is not writable:"""

def write_to_read_only_file():
    try:
        with open("read_only_file.txt", "r") as f:
            f.write("Trying to write to a read-only file.")
    except IOError as e:
        print("An IOError occurred:", e)
    except Exception as e:
        print("An unexpected error occurred:", e)

write_to_read_only_file()
