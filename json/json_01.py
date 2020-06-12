# Github:  thedeclineirl
# Name:    Thomas Higgins
# Created: 2020-06-12
# Editted: 
# ############################## #

import json

json_string = '''{
   "article": [
      {
         "id":"01",
         "language": "JSON",
         "edition": "first",
         "author": "Derrick Mwiti"
      },

      {
         "id":"02",
         "language": "Python",
         "edition": "second",
         "author": "Derrick Mwiti"
      }
   ],
   "blog":[
   {
       "name": "Datacamp",
       "URL":"datacamp.com"
   }
   ]
}
# '''
# json.load vs json.loads
# json.load is used when loading a file while json.loads(load string) is used when loading a string.

python_dict = json.loads(json_string)
print(python_dict['blog'])


# json.dump vs json.dumps
# We use json.dump when we want to dump JSON into a file. 
# json.dumps(dump string) is used when we need the JSON data as a string for parsing or printing.


python_string = json.dumps(json_string)
print(python_string)