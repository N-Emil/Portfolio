// Form göndərildikdə
document.querySelector("form").addEventListener("submit", function (e) {
  e.preventDefault();
  alert("Mesajınız uğurla göndərildi! Tezliklə sizinlə əlaqə saxlayacağam.");
  this.reset();
});

// Navbar linklərinə klik olunduqda hamar sürüşmə
document.querySelectorAll('a[href^="#"]').forEach((anchor) => {
  anchor.addEventListener("click", function (e) {
    e.preventDefault();
    document.querySelector(this.getAttribute("href")).scrollIntoView({
      behavior: "smooth",
    });
  });
});
