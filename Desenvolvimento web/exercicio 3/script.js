function calcularMedia() {
    let notas = [];
    for (let i = 1; i <= 3; i++) {
        let nota = parseFloat(prompt(`Digite a nota ${i}:`));
        notas.push(nota);
    }
    let soma = notas.reduce((acc, curr) => acc + curr, 0);
    let media = soma / notas.length;
    
    console.log(`A média das notas é: ${media.toFixed(2)}`);
}

calcularMedia();

function verificarParImpar() {
    let numero = parseInt(prompt("Digite um número:"));
    
    if (numero % 2 === 0) {
        console.log(`${numero} é par.`);
    } else {
        console.log(`${numero} é ímpar.`);
    }
}

verificarParImpar();


function calculadoraSimples() {
    let num1 = parseFloat(prompt("Digite o primeiro número:"));
    let num2 = parseFloat(prompt("Digite o segundo número:"));
    let operacao = prompt("Escolha a operação (+, -, *, /):");

    let resultado;

    switch (operacao) {
        case "+":
            resultado = num1 + num2;
            break;
        case "-":
            resultado = num1 - num2;
            break;
        case "*":
            resultado = num1 * num2;
            break;
        case "/":
            resultado = num1 / num2;
            break;
        default:
            console.log("Operação inválida!");
            return;
    }

    console.log(`O resultado da operação é: ${resultado}`);
}

calculadoraSimples();

function contagemRegressiva() {
    let contador = 10;

    let intervalo = setInterval(() => {
        console.log(contador);
        contador--;

        if (contador < 0) {
            clearInterval(intervalo);
            console.log("Fim da contagem!");
        }
    }, 1000);  // A cada 1 segundo (1000ms)
}

contagemRegressiva();

