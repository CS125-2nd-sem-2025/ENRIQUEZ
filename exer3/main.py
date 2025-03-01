from fastapi import FastAPI, Request
import platform

app = FastAPI()

@app.get("/")
def get_root():
    return "Welcome to FastAPI Server Information API!"

@app.get("/os")
def get_os():
    return {"os": platform.system()}

@app.get("/version")
def get_version():
    return {"version": platform.version()}

@app.get("/ip")
def get_ip(request: Request): 
    client_ip = request.client.host if request.client else "Unknown"
    return {"ip": client_ip}

@app.get("/all")
def get_all(request: Request):
    client_ip = request.client.host if request.client else "Unknown"
    return {
        "os": platform.system(), 
        "version": platform.version(), 
        "ip": client_ip
    }
