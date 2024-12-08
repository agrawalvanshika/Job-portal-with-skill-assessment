// Navbar Highlight on Scroll
document.addEventListener("DOMContentLoaded", () => {
    const navLinks = document.querySelectorAll(".nav-links a");
  
    window.addEventListener("scroll", () => {
      let currentSection = "";
      document.querySelectorAll("section").forEach((section) => {
        const sectionTop = section.offsetTop - 60;
        const sectionHeight = section.clientHeight;
        if (pageYOffset >= sectionTop && pageYOffset < sectionTop + sectionHeight) {
          currentSection = section.getAttribute("id");
        }
      });
  
      navLinks.forEach((link) => {
        link.classList.remove("active");
        if (link.getAttribute("href").includes(currentSection)) {
          link.classList.add("active");
        }
      });
    });
  });
  
  // Interactive Search Bar
  const searchForm = document.querySelector(".search-bar");
  if (searchForm) {
    searchForm.addEventListener("submit", (e) => {
      e.preventDefault();
      const input = document.querySelector(".search-bar input").value;
      if (input) {
        alert(`Searching for: ${input}`);
      } else {
        alert("Please enter a search term.");
      }
    });
  }
  
  // Subscription Form Handling
  const subscribeForm = document.querySelector(".subscribe-form");
  if (subscribeForm) {
    subscribeForm.addEventListener("submit", (e) => {
      e.preventDefault();
      const emailInput = document.querySelector(".subscribe-form input").value;
  
      if (validateEmail(emailInput)) {
        alert(`Thank you for subscribing with: ${emailInput}`);
        document.querySelector(".subscribe-form input").value = "";
      } else {
        alert("Please enter a valid email address.");
      }
    });
  }
  
  function validateEmail(email) {
    const re = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return re.test(email);
  }
  
  // Job Card Animation (Optional Enhancement)
  const jobCards = document.querySelectorAll(".job-card");
  jobCards.forEach((card) => {
    card.addEventListener("mouseenter", () => {
      card.style.transform = "translateY(-10px)";
      card.style.boxShadow = "0 10px 20px rgba(0, 0, 0, 0.2)";
    });
  
    card.addEventListener("mouseleave", () => {
      card.style.transform = "translateY(0)";
      card.style.boxShadow = "0 4px 8px rgba(0, 0, 0, 0.1)";
    });
  });
  
  // Smooth Scrolling for Anchor Links
  document.querySelectorAll("a[href^='#']").forEach((anchor) => {
    anchor.addEventListener("click", function (e) {
      e.preventDefault();
      document.querySelector(this.getAttribute("href")).scrollIntoView({
        behavior: "smooth",
      });
    });
  });
  