import matplotlib.pyplot as plt

readings = []
for line in open('nathan_moving.txt', 'r'):
    line = line.strip()
    readings.append(line)



plt.plot(readings)
plt.show()