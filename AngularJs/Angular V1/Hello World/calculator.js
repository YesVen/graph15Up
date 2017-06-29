(function(){
	
	angular.module("Discount",[])
		.factory("DiscountService", function(){
			var time = 13.0;
			this.countries = ["IND","USA","FR","AUS","NZ","UK","PAK","SA"];
			this.country = "NZ";
			this.discountPerCountry = {
				"IND" : 13,
				"USA" : 2,
				"FR" : 4,
				"AUS" : 3,
				"NZ" : 26,
				"UK" : 7,
				"PAK" : 33,
				"SA" : 5
			};
			var getDiscount = function(){
				return this.discountPerCountry[this.country] / time ;
			};

			return {
				getDiscount : getDiscount,
				discountPerCountry : this.discountPerCountry,
				countries : this.countries,
				country : this.country
			}
	});
	
	
	angular.module("Calculator",["Discount"])
		.controller("sampleController", ['DiscountService',function calculationController(discountService){
				
		this.cost = 2;
		this.qty = 13;
		this.currency = "DOLLAR";
			this.currencies = ["EURO", "RUPEE", "ZEN","DOLLAR"];
		this.conversionRate = {
			"DOLLAR" : 1,
			"EURO"	 : 2.4,
			"RUPEE"	 : 0.6,
			"ZEN"	 : 1.2
		};
		this.total = function(){
			var conversion = this.conversionRate[this.currency] * this.cost;
			var totalAmt = this.qty * conversion;
			
			totalAmt = totalAmt - discountService.getDiscount();
			alert(totalAmt);
		};
			
			this.getCountries = discountService.countries;	
		this.country = discountService.country;
	}]);;
	
	
	
})();