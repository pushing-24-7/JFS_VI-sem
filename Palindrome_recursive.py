word=input("Enter your word: ")

def palindrome(n):
    if len(n)<4 and n[0]==n[-1]:
        return True
    elif n[0]==n[-1]:
        return palindrome(n[1:len(n)-1])
    else:
        return False


print(palindrome(word))
