import pickle
arr = ["hey", "you"]

f = open("my.pickle", "wb")
pickle.dump(arr, f)
f.close() 