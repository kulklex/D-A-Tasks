from .views import *
from django.contrib import admin
from django.urls import path

urlpatterns = [
    path('', req, name="Home"),
    path('details/<id>', id, name='details' ),
    path('contact', contact, name="contact")
]
