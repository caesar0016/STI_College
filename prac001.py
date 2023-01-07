students = {}


# print(students)

for students01 in range(3):
    studentNo = input("Enter No: ")
    studentName = input("Enter Name: ")
    students [studentNo] = studentName
 

for studentNum, studentName in students.items():
    print("............................")
    print(str(studentNum) + " " + str(studentName))

del students[studentNo]

student03 = input("Enter Number: ")
studentName03 = input("Enter Name: ")

students [student03] = studentName03

for studentNum, studentName in students.items():
    print("............................")
    print(str(studentNum) + " " + str(studentName))