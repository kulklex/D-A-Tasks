from django.shortcuts import render, HttpResponse
from django.urls import is_valid_path
from home.forms import ContactForm

from home.models import Contact, Post

# Create your views here.
def req(requests):
    posts = Post.objects.all()
    context={"my_posts": posts, "name":"hassan"}
    
    return render(requests, "home/index.html", context=context,)

def id(requests, id):
    print(id)
    post = Post.objects.get(id=id)
    print(post)
    return render(requests, 'home/post.html', {'posts':post})

def req2(requests):
    return HttpResponse("Second Route")


def about(request):
    return render(request, "home/about.html")


def contact(request):
    if request.method=="POST":
       contact = Contact(email=request.POST['email'],name=request.POST['name'],message=request.POST['message'],phone=request.POST["phone"])
       contact.save()
       return render(request, 'home/contact.html')
    return render(request, 'home/contact.html')

def customContact(request):
    form = ContactForm()
    if request.method=="POST":
        form = ContactForm(request.POST)
        if form.is_valid():
            form.save()
    
    context = {"form": form}
    return render(request, 'home/about.html', context=context)