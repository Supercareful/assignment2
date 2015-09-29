package ca.ubc.cpsc310.gitlab.client.user;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.List;

import ca.ubc.cpsc310.gitlab.client.products.ProductItem;
import ca.ubc.cpsc310.gitlab.client.products.ProductItem;




@SuppressWarnings("unchecked")
public class User implements IUser {

	
	private static final long serialVersionUID = -4678920906536621479L;
	
	private List<ProductItem> shoppingCart = new ArrayList<ProductItem>();
	private List<ProductItem> wishList = new ArrayList<ProductItem>();
	private final String LANG = "LANG";
	private final String NAME = "NAME";
	private final String WISHLIST = "WISHLIST";
	private final String SHOPPINGCART = "SHOPPINGCART";
	
	private Map<String, Object> data = new HashMap<String, Object>();
	private String name;
	private String language;

	
	public User()
	{
		data.put(WISHLIST, new ArrayList<Object>());
		data.put(SHOPPINGCART, new ArrayList<Object>());
	}
	
	@Override
	public String getLanguage() {

		return language;

	}

	@Override
	public String getName() {


		return name;

	}

	@Override
	public List<ProductItem> getWishList() {

		return wishList;

	}

	@Override
	public List<ProductItem> getShoppingCart() {

		return shoppingCart;

	}

	@Override
	public void setLanguage(String language) {

		data.put(LANG,language);

		this.language = language;

		
	}

	@Override
	public void setName(String name) {

		data.put(NAME, name);

		this.name = name;

		
	}

	@Override
	public void addItemToWishList(ProductItem o) {

		((List<ProductItem>) data.get(WISHLIST)).add(o);
	}


	@Override
	public void removeItemFromWishList(ProductItem o) {
		this.wishList.remove(o);
	}
	
	@Override
	public void addItemToShoppingCart(ProductItem o) {
		this.shoppingCart.add(o);
		
	}

	@Override
	public void removeItemFromShoppingCart(ProductItem o) {

		((List<ProductItem>) data.get(SHOPPINGCART)).add(o);

		this.shoppingCart.remove(o);
	}


}
