from flask import Flask , render_template
app = Flask (__Moonest__)

@app.route('/')
def index ():
    return 'Hola mundo'
    
if __name__ == '__main__':
    app.run(debug=True)
    
        
