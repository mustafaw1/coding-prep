import requests as req

url = "https://docs.oracle.com/javase/specs/jls/se8/jls8.pdf"

local_filename = '\\Users\\Qaisar Abbas\\Desktop\\Coding-Prep\\Python\\java'

r = req.get(url, stream=True)

with open(local_filename, 'wb') as f:
    for chunk in r.iter_content(chunk_size=10):
        f.write(chunk)