import time


valid_sources = ["/dev/ttyUSB0", "/dev/ttyUSB1"]

class SerialSimulator:
    def __init__(self, source, baud_rate=None):
        if source not in valid_sources:
            raise Exception(f"Invalid source, no device connected at {source}")

        if baud_rate != 57600:
            raise Exception(f"Invalid baud rate for HRUSB-MaxSonar")


        with open("nathan_moving.txt", "rb") as f:
            self._data = f.read()
            self._length = len(self._data)
            self._ptr = 0

    def read(self, no_of_bytes):
        start = self._ptr % self._length
        end = (self._ptr + no_of_bytes + 1) % self._length
        self._ptr = end
        b = self._data[start: end]
        time.sleep(0.2)
        return b
