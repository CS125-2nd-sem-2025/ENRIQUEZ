# ⚡ FastAPI Server Information API ⚡

This API returns server information such as the OS, version of the OS and the IP of the requestor/client.

## API Endpoints 

The API has the following endpoints

- **/os** : os where api is running 
- **/version** : os version where api is running
- **/ip** : ip of the requestor/client
- **/all** : all information in 1 json reponse

## Installation and Running of the API 

1. Clone the repository
    Open your terminal in your desired directory and run the following command
    ```
    git clone https://github.com/CS125-2nd-sem-2025/ENRIQUEZ.git
    cd exer3
    ```

2. Create a virtual environment
    - Run the following command in your terminal: `python -m venv .venv`
    - If you're using Linux or macOS and this doesn't work try running: `python3 -m venv .venv`

3. Activate the virtual environment 
   Run the the following command in your terminal. Make sure exer3 is the directory:
   - For Windows CMD: `.venv/Scripts/activat`
   - For Linux, macOS: `source .venv/bin/activate`

4. Install the dependencies
    - Run: `pip install -r requirements.txt`

5. Run the fastAPI Application
    - Run: `uvicorn main:app --reload`

6. Check the desired information in your browser
    - Type `http://127.0.0.1:8000/` in your browser to access the root of the fastAPI
    - Type `http://127.0.0.1:8000/<your-desired-endpoint>` to access the information you want
        - For example: Type `http://127.0.0.1:8000/os` in your browser to access the information about the server's OS

7. If you're finished using the API. Stop the server and deactivate the virtual environment
    - Press `Ctrl+C` in your terminal where the virtual environment is to stop the server
    - Then type `deactivate` to deactivate the virtual environment

## Documentation

If you want to see the documentation and try using the endpoints without typing links in step 6 in your browser, you can open the SwaggerUI documentation builtin by fastAPI. In your browser, type `http://127.0.0.1:8000/docs`.



    

