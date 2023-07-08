from abc import ABCMeta, abstractmethod
class shape(metaclass=ABCMeta):
    @abstractmethod
    def area(self):
        return 0
    
class rectangle(shape):
    type = 'rectangle'
    sides = 4
    def __init__(self): 
        self.length = 6
        self.breadth = 7
    def area(self):
        return self.length * self.breadth
    
a1 = rectangle()
print(a1.area())