import requests
from bs4 import BeautifulSoup


url = "https://www.thenetnaija.net/videos/movies"
res = requests.get(url)

soup = BeautifulSoup(res.text, "html.parser")

divs = soup.find_all("div", {"class": "thumbnail"})

for imageTag in divs:
    print(imageTag.find("img").get("src"))

divs2 = soup.find_all("div", {"class": "info"})

for link in divs2:
    print(link.find("h2").find("a").get("href"))
    print(link.find("h2").find("a").text)


