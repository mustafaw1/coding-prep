import pylint
# class Student:
#     def __init__(self):
#         self.__name = " "
#     def setname(self, name):
#         print('setname() called')
#         self.__name = name
#     def getname(self):
#         print('getname() called')
#         return self.__name
#     name = property(getname, setname)

class Employee:
    def __init__(self, name, age, salary):
        self.name = name
        self.age = age
        self.salary = salary

    def increase(self):
        self.salary = int(self.salary * self.increment)
    @classmethod
    def increment_salary(cls, amount):
        cls.increment =  amount
    @property
    def email(self):
        if self.email == None:
            return 'email not set'
        else:
           return self.name + "@gmail.com"
    @email.deleter
    def email(self):
        self.name = None


class Programmer(Employee):
    def __init__(self, name, age, salary, prolang, exp):
        super().__init__(name, age, salary)
        self.proglang = prolang
        self.exp = exp

                     
  
mustafa = Employee("Mustafa", 24, 50000)
taha = Employee("Taha", 30, 4503288)

print(taha.age)




