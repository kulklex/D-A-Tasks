from django.db import models

# Create your models here.
class Post(models.Model):
    title = models.CharField(max_length=25)
    body = models.TextField()
    date = models.DateTimeField(auto_now_add=True)
    author= models.CharField(max_length=25, null=True)
    is_published = models.BooleanField(default = True)
    snippet = models.CharField(max_length=50, blank=True)
    
    def save(self, *args, **kwargs):
        self.snippet = self.body[:5]
        super().save(*args, **kwargs)
        
    def __str__(self) -> str:
        return self.title
    


class Contact(models.Model):
    name = models.CharField(max_length=25)
    email = models.EmailField()
    phone = models.CharField(max_length=25)
    message = models.TextField()
    
    def __str__(self) -> str:
        return self.name+ " says: \n " + self.message