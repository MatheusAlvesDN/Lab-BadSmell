# Lab-BadSmell
 
O código tinha como principal problema a classe cliente e seu método histórico, que além de ser muito extenso, se tornando assim difícil de compreender,  também tem um problema com “inveja de recursos” acessando muitos atributos das classes compra e anúncio. Além do uso de Switch que é um solução bastante questionável, já que a medida que o código cresce e são necessárias adição de outros recursos o switch case vai se tornando cada vez mais longo e confuso.
