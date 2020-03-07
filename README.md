# Latest-Message-API

## Design API to get latest message id such that no previous messages are missing. It should have following methods:

This method should adds a message with id number as received message
def ack(number)

this method should return the id of last message whose previous counts are not missing
def latest()

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
