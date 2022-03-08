# LockerManagementStore
Design a Locker Management store for an ecommerce store. While performing a purchase, users can opt for their packages to be delivered at a Locker system close to their place. The delivery person will place the package in a locker. An otp will be generated and sent to the user once the package is added into the locker.

As per user’s convenience they can visit their locker, enter the otp & get their parcel. Further if the user wants to return the goods, they can visit the locker and place their item. Delivery guy will get an otp that can be used to pick up the parcel.


—---------------------

-> Admins can view/clear locker contents that are in use for more than 3 days
-> Once the package is taken out, locker is free
-> Delivery executive can deliver multiple orders in one delivery instance
-> An order can have multiple packages
-> A locker can be allotted to fit packages of multiple customers but only one locker would handle all packages associated with a customer’s order
-> Maximum number of packages for an order <= 4
-> Lockers can fit in packages of relevant size

Locker  - Size - Packages
	        XL       10
	        L         5
          M         3
          S         1
