class Home extends React.Component {

    constructor(props, context) {
        super(props, context);
        this.state = {
            name : 'Warren'
        }
    }

    render() {
        return (
            <div>
            Haha {this.state.name}
    </div>
    );
    }
}