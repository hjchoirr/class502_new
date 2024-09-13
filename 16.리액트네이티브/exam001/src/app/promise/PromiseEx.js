export function async1(param) {
    return new Promise((resolve, reject) => {
        resolve(param*2);
    });
};

export function async2(param) {
    return new Promise((resolve, reject) => {
        resolve(param*3);
    });
};

export function async3(param) {
    return new Promise((resolve, reject) => {
        resolve(param*6);
    });
};
