
import './App.css';

function App() {

  const numberDropdown = <select>
  <option>0</option>
  <option>1</option>
  <option>2</option>
  <option>3</option>
  <option>4</option>
  <option>5</option>
  <option>6</option>
  <option>7</option>
  <option>8</option>
  <option>9</option>
  </select>

  const constructRow = () => (
  <tr>
  {[...Array(9).keys()].map((index) => (
    <td key = {index}>{numberDropdown} </td>
  ))}
  </tr>
)
  return (
    <div className="App">
      <header className="App-header">
        Sudoku App
      </header>
      <div className="userTable">
        <table>
          <tbody>
            {[...Array(9).keys()].map((index) => (
              <tr key={index}>{constructRow()}</tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );
}

export default App;
