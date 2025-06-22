gradebook = {
    "Amit": [85, 90, 78],
    "Priya": [92, 88, 95],
    "Rahul": [76, 82, 89],
    "Sara": [90, 91, 92]
}

# Accessing Priya's grades
priya_grades = gradebook["Priya"]
print(f"Priya's grades: {priya_grades}")

# Changing Priya's second grade (index 1) from 88 to 93
gradebook["Priya"][1] = 93
print(f"Priya's updated grades: {gradebook['Priya']}")

# Adding a new grade for Rahul
gradebook["Rahul"].append(94)
print(f"Rahul's updated grades: {gradebook['Rahul']}")

removed = gradebook["Rahul"].pop(3)
print(f"Removing Rahul's fourth grade: {removed}")

# Calculating average grades for each student
for student, grades in gradebook.items():
    avg = sum(grades) / len(grades)
    print(f"{student}: Average = {avg:.2f}")

# Adding a new student
gradebook["Neha"] = [88, 90, 85]
print("Added Neha:", gradebook["Neha"])

# Removing a student
del gradebook["Amit"]
print("Amit removed. Current students:", list(gradebook.keys()))

# Finding the topper student
top_student = max(gradebook, key=lambda s: sum(gradebook[s]) / len(gradebook[s]))
print(f"Top student: {top_student}")

