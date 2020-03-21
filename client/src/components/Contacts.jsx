import React, { Component } from "react";
import SignleContact from "./SignleContact";
import AddContact from "./AddContact";

export default class Contacts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      contacts: []
    };
  }

  componentDidMount() {
    fetch("http://localhost:8080/api/v1/contacts")
      .then(response => response.json())
      .then(data => this.setState({ contacts: data._embedded.contacts }));
  }

  render() {
    return (
      <div>
        <div className="row">
          <AddContact />
        </div>
        <div className="row">
          {this.state.contacts.map(item => (
            <SignleContact key={item.id} item={item} />
          ))}
        </div>
      </div>
    );
  }
}
