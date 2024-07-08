a = "ABC"
print(type(a)) # <class 'str'>

a = 'ABC'
print(type(a)) # <class 'str'>

str = "I'm a student"
print(str)  # I'm a student

str = 'I\'m a student'
print(str)  # I'm a student \ : escape 문자

str = "I'm a \"Student\""
print(str)  # I'm a "Student"

print()

str = "TodoList\n1.exercise\n2.breakfast"
print(str)
print()

str = """TodoList
1.exercise
2.breakfast"""

print(str)
print()

a = "ABC"
print(a * 3)  # ABCABCABC

print(len(a))