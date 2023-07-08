class Person:
    def __init__(self, name, gpa):
        self.name = name
        self.gpa = gpa
        
person_objects = [
    Person("Taha", 3.4),
    Person("Mustafa", 3.2),
    Person("Murtaza", 3.1)
]
x= sorted(person_objects, key=lambda l: l.gpa)
print(x)
