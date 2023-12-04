from 192.168.44.1:5000/python:3.8-alpine

run mkdir /app

workdir /app

copy ./app.py .
