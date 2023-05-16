const cells = document.getElementsByClassName('cell');
let currentPlayer = 'X';
let gameOver = false;

function makeMove(cellIndex) {
  if (!gameOver && !cells[cellIndex].textContent) {
    cells[cellIndex].textContent = currentPlayer;
    cells[cellIndex].classList.add(currentPlayer);

    if (checkWin()) {
      displayMessage('Player ' + currentPlayer + ' wins!');
      gameOver = true;
    } else if (checkDraw()) {
      displayMessage('It\'s a draw!');
      gameOver = true;
    } else {
      currentPlayer = currentPlayer === 'X' ? 'O' : 'X';
    }
  }
}

function checkWin() {
  const winningCombinations = [
    [0, 1, 2],
    [3, 4, 5],
    [6, 7, 8],
    [0, 3, 6],
    [1, 4, 7],
    [2, 5, 8],
    [0, 4, 8],
    [2, 4, 6]
  ];

  for (let combination of winningCombinations) {
    if (
      cells[combination[0]].textContent === currentPlayer &&
      cells[combination[1]].textContent === currentPlayer &&
      cells[combination[2]].textContent === currentPlayer
    ) {
      return true;
    }
  }

  return false;
}

function checkDraw() {
  for (let i = 0; i < cells.length; i++) {
    if (cells[i].textContent === '') {
      return false;
    }
  }

  return true;
}

function resetBoard() {
  for (let i = 0; i < cells.length; i++) {
    cells[i].textContent = '';
    cells[i].classList.remove('X');
    cells[i].classList.remove('O');
  }

  currentPlayer = 'X';
  gameOver = false;
}

function displayMessage(message) {
  const messageElement = document.createElement('div');
  messageElement.textContent = message;
  messageElement.classList.add('message');
  document.body.appendChild(messageElement);
}
