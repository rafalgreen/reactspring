import React from 'react';
import ReactDOM from 'react-dom';



function Welcome(props) {
    return <h1>Hello, {props.name}</h1>;
}

function App() {
    return (
        <div>
            <Welcome name="Sara" />
            <Welcome name="Cahal" />
            <Welcome name="Edite" />
            <div>
                <h1>Hello, world!</h1>
                <h2>It is {new Date().toLocaleTimeString()}.</h2>
            </div>
        </div>
    );
}

ReactDOM.render(
    <App />,
    document.getElementById('root')
);