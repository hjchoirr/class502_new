a = "Life is too short, You need to Python"

print(a[0])     # L
print(a[5])     # i

print(a[-1])    # n

print(a[0:4])   # Life

print(a[3:])    # e is too short, You need to Python
print(a[-3:])   # hon
print(a[:-5])   # Life is too short, You need to P

b = a[:]
print(b)  # Life is too short, You need to Python

a = "2024-07-09 16:30:00"
year = a[:4]    # 2024
month = a[5:7]  # 07
day = a[8:10]   # 09

hour = a[-8:-6] # 16

print(year)
print(month)
print(day)
print(hour)


