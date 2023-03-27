package class08;

public class ProductMain {
	public static void main(String[] args) {
		
		//데이터를 생성해주는 객체 생성
		ProductData pd = new ProductData();
		Product[] products = pd.products;
		
		//[문제 .1] 전체 상품 목록 출력
		printProduct(products);
		
		//[문제.2] 세탁기의 가격을 조회하시오
		String tempstr = "세탁기";
		getWashPrice(tempstr,products);
		
		//[문제.3] 구매한 모든 제품의 총액과 평균 가격을 main 메소드에서 출력하세요.
		int sum = getTotalAmount(products);
		System.out.println("구매한 모든 제품의 총액은? : " + sum);
		double avg = getAvg(products);
		System.out.printf("구매한 모든 제품의 평균가격은? %.1f", avg);
		System.out.println("\n");
		
		//[문제.4] 제품 중 100만원이 넘는 제품의 목록, 수량, 합계금액 출력
		getProductGrather100(products);
		
	}
	//[문제.4] 제품 중 100만원이 넘는 제품의 목록, 수량, 합계금액 출력
	private static void getProductGrather100(Product[] products) {
		int count = 0;
		int sum = 0;
		System.out.println("가격이 100만원 이상인 제품은 다음과 같습니다. \n");
		for (Product product : products) {
			if (product.getPrice()>=1000000) {
				count++;
				System.out.println(product.getId()+ "\t" + product.getName()+ "\t" + product.getPrice());
				System.out.println("---------------------------------------------------------------------------");
				sum += product.getPrice();
			}		
		}System.out.printf("100만원 이상인 제품의 수량은 : %s 이며 합계금액은 : %s 입니다.",count, sum);
		
	}
	//[문제.3-1] 구매한 모든 제품의 총액
	private static int getTotalAmount(Product[] products) {
		int sum = 0;
		for (Product product : products) {
			sum += product.getPrice();
		}
		return sum;
	}
	
	//[문제.3-2]구매한 모든 제품의 평균
	private static double getAvg( Product[] products) {
		int sum = 0;
		double avg = 0.0;
		for (Product product : products) {
			sum += product.getPrice();
		}
		avg = (double)sum/products.length;
		return avg;
	}

	// [문제 .1] 전체 상품 목록 출력
	private static void printProduct(Product[] products) {
		for (Product product : products) {
			System.out.println(product.getId() + "\t" + product.getName() + "\t" + product.getPrice());
		}
	}

	// [문제.2] 세탁기의 가격을 조회하시오
	private static void getWashPrice(String tempstr, Product[] products) {
		for (Product product : products) {
			if (product.getName().equals(tempstr)) {
				System.out.println("세탁기의 가격은? : " + product.getPrice());
			}
		}
	}

}
