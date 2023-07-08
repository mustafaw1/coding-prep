from django.shortcuts import render
import requests

# Create your views here.
def home(request):
    city = request.GET.get('city' , "Lahore")
    url = f"https://api.openweathermap.org/data/2.5/weather?q={city}&appid=19d718632a69be82c66409a943be3e40"
    data = requests.get(url).json()
    payload = {
        "city": data["name"],
        "weather": data["weather"][0]["main"],
        "icon": data["weather"][0]["icon"],
        "kelvin_temperature": data["main"]["temp"],
        "celcius_temperature": data["main"]["temp"] - 273,
        "pressure": data["main"]["temp"],
        "humidity": data["main"]["humidity"],
        "description": data["weather"][0]["description"],
    }
    context = {"data": payload}
    print(context)
    return render(request, "home.html", context)
