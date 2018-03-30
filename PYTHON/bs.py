"""
주제 : Beautiful Soup 설치 및 작동
작성일 : 2017.12.07.
작성자 : 박찬우
"""
from bs4 import BeautifulSoup

html = """
<html>
    <head>
        <title> test web </title>
    </head>
    <body>
        <p align="center"> text contents </p>
        <img src="C:\workspace\shibadog.jpg" width="500" height="300">
    </body>
</html> """

bs = BeautifulSoup(html, "html.parser")
print(bs.prettify())
print(bs.find("title"))
