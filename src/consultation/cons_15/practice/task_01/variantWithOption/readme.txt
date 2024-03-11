Task #1
-----------
You receive a "query" which contains text and a value (from 100 to 550).

You need to receive this request:
1) check the correctness of the data (the length of the message is less than 10 characters)
2) using the value from the query if it:
a) from 100 to 200 - return the message ("Request received")
b) from 200 to 300 - return the message ("Ok")
c) between 300 and 400 - return the message ("Service request")
d) from 400 to 500 - return the message ("User error")
e) from 500 to 550 - return the message ("Server error")

3) display a message to the user