document.getElementById('imcForm').addEventListener('submit', function (e) {
  e.preventDefault();

  const peso = parseFloat(document.getElementById('peso').value);
  const altura = parseFloat(document.getElementById('altura').value);
  const resultadoDiv = document.getElementById('resultado');

  if (peso > 0 && altura > 0) {
    const imc = peso / (altura * altura);
    let classificacao = '';

    if (imc < 18.5) {
      classificacao = 'Abaixo do peso';
    } else if (imc < 24.9) {
      classificacao = 'Peso normal';
    } else if (imc < 29.9) {
      classificacao = 'Sobrepeso';
    } else if (imc < 34.9) {
      classificacao = 'Obesidade grau 1';
    } else if (imc < 39.9) {
      classificacao = 'Obesidade grau 2';
    } else {
      classificacao = 'Obesidade grau 3 (mórbida)';
    }

    resultadoDiv.innerHTML = `
      <p>Seu IMC é <strong>${imc.toFixed(2)}</strong></p>
      <p>Classificação: <strong>${classificacao}</strong></p>
    `;
  } else {
    resultadoDiv.innerHTML = '<p class="text-danger">Por favor, insira valores válidos.</p>';
  }
});
