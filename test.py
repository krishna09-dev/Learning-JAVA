import tkinter as tk
from tkinter import messagebox

class Land:
    def __init__(self, kitta, location, direction, area, price, status):
        self.kitta = kitta
        self.location = location
        self.direction = direction
        self.area = area
        self.price = price
        self.status = status  # Available or Not Available

class LandRentingApp:
    def __init__(self, root):
        self.root = root
        self.root.title("Land Renting System")
        
        # Initialize lands
        self.lands = self.read_lands_from_file('lands.txt')

        # Create UI elements
        self.label = tk.Label(root, text="Available Lands:")
        self.label.pack()

        self.textbox = tk.Text(root, height=10, width=50)
        self.textbox.pack()
        self.display_available_lands()

        self.rent_button = tk.Button(root, text="Rent Land", command=self.rent_land)
        self.rent_button.pack()

        self.return_button = tk.Button(root, text="Return Land", command=self.return_land)
        self.return_button.pack()

    def read_lands_from_file(self, file_name):
        lands = []
        with open(file_name, 'r') as file:
            for line in file:
                data = line.strip().split(', ')
                land = Land(*data)
                lands.append(land)
        return lands

    def display_available_lands(self):
        available_lands = [land for land in self.lands if land.status == 'Available']
        if available_lands:
            for land in available_lands:
                self.textbox.insert(tk.END, f"Kitta {land.kitta}: {land.location}, {land.direction}, {land.area} anna, Price: {land.price} NPR\n")
        else:
            self.textbox.insert(tk.END, "No lands available for rent.\n")

    def rent_land(self):
        # Placeholder for renting logic
        messagebox.showinfo("Rent Land", "Renting functionality not implemented yet.")

    def return_land(self):
        # Placeholder for returning logic
        messagebox.showinfo("Return Land", "Returning functionality not implemented yet.")

if __name__ == "__main__":
    root = tk.Tk()
    app = LandRentingApp(root)
    root.mainloop()
