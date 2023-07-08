class Person:
    def __init__(self, name, age, salary):
        self.name = name
        self.age = age
        self.salary = salary
        self.email = self.name + "@gmail.com"
    def info(self):
        print (f"Name is {self.name} age is {self.age} salary is {self.salary}")
    @property
    def ten_salary(self):
        return 10 * self.salary
    @ten_salary.setter
    def ten_salary(self, new_salary):
        self.salary = new_salary/10
            

mustafa = Person("Mustafa", 24, 50000) 
print(mustafa.email)

