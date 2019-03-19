# Pin-The-Cougar

Nothing really happened in the end.

This was supposed to assign some kind of target for every person (and then you play the game in real life).

One of the most hilarious errors in the project was when creating a "double linked list" (_not doubly linked_) where each object in the list would have an additional pointer to the next object. (Kinda redundant thinking about it but this was to enforce the concept of a target.) The error was that the toString would call the toString of the next object. So "circularly linked objects stack overflow" happened!
