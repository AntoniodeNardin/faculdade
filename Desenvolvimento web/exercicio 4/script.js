function operar(operacao) {
    let num1 = parseFloat(document.getElementById("numero1").value);
    let num2 = parseFloat(document.getElementById("numero2").value);
    let resultado = document.getElementById("resultado");

    if (isNaN(num1) || isNaN(num2)) {
        resultado.textContent = "Por favor, insira números válidos.";
        return;
    }

    let calculo;
    switch (operacao) {
        case '+':
            calculo = num1 + num2;
            break;
        case '-':
            calculo = num1 - num2;
            break;
        case '*':
            calculo = num1 * num2;
            break;
        case '/':
            if (num2 === 0) {
                resultado.textContent = "Não é possível dividir por zero!";
                return;
            }
            calculo = num1 / num2;
            break;
    }

    resultado.textContent = `Resultado: ${calculo}`;
}

function limpar() {
    document.getElementById("numero1").value = '';
    document.getElementById("numero2").value = '';
    document.getElementById("resultado").textContent = '';
}
