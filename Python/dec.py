def mydecorator(func):
    def innerfunction():
        func()
        print('greeting')
    return innerfunction
    
@mydecorator
def greet():
    print('hello how are you')

greet()


