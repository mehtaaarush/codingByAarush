#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

#define MAX 1000

typedef struct {
    int q[MAX];
    int front;
    int rear;
} MyStack;

/** Initialize your data structure here. */
MyStack* myStackCreate() {
    MyStack* st = (MyStack*)malloc(sizeof(MyStack));
    st->front = 0;
    st->rear = 0;
    return st;
}

/** Push element x onto stack. */
void myStackPush(MyStack* obj, int x) {
    int size = obj->rear - obj->front;
    obj->q[obj->rear++] = x;

    // Rotate the queue
    for (int i = 0; i < size; i++) {
        obj->q[obj->rear++] = obj->q[obj->front++];
    }
}

/** Removes the element on top of the stack and returns that element. */
int myStackPop(MyStack* obj) {
    return obj->q[obj->front++];
}

/** Get the top element. */
int myStackTop(MyStack* obj) {
    return obj->q[obj->front];
}

/** Returns whether the stack is empty. */
bool myStackEmpty(MyStack* obj) {
    return obj->front == obj->rear;
}

/** Free memory */
void myStackFree(MyStack* obj) {
    free(obj);
}