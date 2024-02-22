# Taxi fleet app.

This is a demo project.

## Deployment
#### You just need to call the following scripts to run the project.
#### It will automatically set up DB and will create all tables.  

To clean DB call
```sh
./clean-database.sh
```

To build the project call
```sh
./build.sh
```

To run the project call
```sh
./run.sh
```

### Examples and hints
1. List all taxis:
```
curl --location 'http://localhost:11000/taxis
```

2. Create a taxi:
```
curl --location 'http://localhost:11000/taxis' \
--header 'Content-Type: application/json' \
--data '{
    "name": "Taxi 2",
    "state": "AVAILABLE"
}'
```

3. Update a taxi state:
```
curl --location --request PUT 'http://localhost:11000/taxis/state/1/AVAILABLE'
```

4. Book a taxi:
```
curl --location 'http://localhost:11000/bookings' \
--header 'Content-Type: application/json' \
--data-raw '{
    "taxiId": 2,
    "passengerEmail": "passenger2@email.com"
}'
```

5. Get bookings count for each passenger:
```
curl --location 'http://localhost:11001/bookings/count'
```
