import base64
import requests
import json

url = "http://127.0.0.1:8000/api/v1/student/"

headers = {
        'Content-Type': 'multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW',
      }
with open('\\Users\\Qaisar Abbas\\Desktop\\Coding-Prep\\Python\\milk.jpg', "rb") as f:
    im_bytes = f.read()        
im_b64 = base64.b64encode(im_bytes).decode("UTF-8")

data = {"profile_image": im_b64, "name": "Imran", "age": "24", "grade": "B+", "courses": [1,2]}

response = requests.post(url,headers=headers, data=json.dumps(data))

print("Status_code", response.status_code)
print("JSON Response ", response.json())
