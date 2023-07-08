import simulator
from collections import deque
from faker import Faker


def check_is_coming_going(d):
    increase_readings = 0
    decrease_readings = 0
    for i in range(0, len(d) - 1):
        if len(d) == 10:
            if d[i + 1] - d[i] > 5:
                increase_readings += 1
            elif d[i + 1] - d[i] < -5:
                decrease_readings += 1
    if increase_readings > 6:
        return "going"
    elif decrease_readings > 6:
        return "coming"


if __name__ == "__main__":
    ser = simulator.SerialSimulator("/dev/ttyUSB0", 57600)
    d = deque(maxlen=10)
    while True:
        data = ser.read(6)
        data = int(data[1:].strip())
        d.append(data)
        print(check_is_coming_going(list(d)))
           
