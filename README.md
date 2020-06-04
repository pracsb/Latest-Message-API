# Latest-Message-API

## Design API to get latest message id such that no previous messages are missing. It has the following methods:

## 1) ack(number)
This method adds a message with id number as received message

## 2) latest()
This method should return the id of last message whose previous counts are not missing


    Example: 
    Handshake h = new Handshake();
    h.ack(1);
    h.ack(4);
    h.ack(2);
    h.latest() : return 2
    h.ack(7);
    h.ack(3);
    h.ack(6);
    h.ack(100);
    h.ack(8);
    h.ack(5);
    h.latest() : return 8
