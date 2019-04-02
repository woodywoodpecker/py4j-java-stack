class Clock extends React.Component {
    render() {
        return (
            <div>
                <h2>现在是 {this.props.date.toLocaleTimeString()}.</h2>
            </div>
        );
    }
}