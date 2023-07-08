def singleton(class_):
    instances = {}
    def getinstance(*args, **kwargs):
        if class_ not in instances:
            instances[class_] = class_(*args, **kwargs)
        return instances[class_]
    return getinstance
@singleton    
class MongoConnection():
    def __init__(self):
        print("mongo connection establish")


obj = MongoConnection()
obj1 = MongoConnection()
print(id(obj))



