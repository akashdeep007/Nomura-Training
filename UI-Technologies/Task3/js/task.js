let contentLoader = () => {
    let data = [
        { imgsrc: "assets/img/icon/001-magnifying-glass.png", cardTitle: "Video Marketing", cardText: "This is a wider card with supporting text below as a natural lead-in toadditional content. This content is a little bit longer." },
        { imgsrc: "assets/img/icon/002-target.png", cardTitle: "Email Marketing", cardText: "This is a wider card with supporting text below as a natural lead-in toadditional content. This content is a little bit longer." },
        { imgsrc: "assets/img/icon/003-task.png", cardTitle: "SEO Optimization", cardText: "This is a wider card with supporting text below as a natural lead-in toadditional content. This content is a little bit longer." },
        { imgsrc: "assets/img/icon/004-hiring.png", cardTitle: "Custom Website", cardText: "This is a wider card with supporting text below as a natural lead-in toadditional content. This content is a little bit longer." },
        { imgsrc: "assets/img/icon/005-seminar.png", cardTitle: "Content Growth", cardText: "This is a wider card with supporting text below as a natural lead-in toadditional content. This content is a little bit longer." },
        { imgsrc: "assets/img/icon/006-analytics.png", cardTitle: "Link Building", cardText: "This is a wider card with supporting text below as a natural lead-in toadditional content. This content is a little bit longer." }
    ];


    data.forEach(res => {
        let container = document.querySelector("#dynamiccontent");
        let div = document.createElement("div");
        div.classList.add("col-lg-4", "col-sm-6", "col-md-6", "mb-3");
        let card = document.createElement("div");
        card.classList.add("card", "z-depth-2");
        let img = document.createElement('img');
        img.src = res.imgsrc;
        img.classList.add("card-img-top", "rounded-circle");
        card.appendChild(img);
        let cardBody = document.createElement("div");
        cardBody.classList.add("card-body");
        let heading = document.createElement("h5");
        heading.classList.add("card-title", "text-center", "text-dark", "font-weight-bold");
        heading.innerText = res.cardTitle;
        cardBody.appendChild(heading);
        let para = document.createElement("p");
        para.classList.add("card-text", "text-center", "text-dark");
        para.innerText = res.cardText;
        cardBody.appendChild(para);
        card.appendChild(cardBody);
        div.appendChild(card);
        container.appendChild(div);

    });
};
